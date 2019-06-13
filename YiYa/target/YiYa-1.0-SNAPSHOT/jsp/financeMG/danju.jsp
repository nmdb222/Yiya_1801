<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/05/13
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>后台登录-L-admin1.0</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="shortcut icon" href="../favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="/layui/css/font.css">
    <link rel="stylesheet" href="/layui/css/xadmin.css">
    <link rel="stylesheet" href="../layui/css/xadmin.css">
    <script src="/layui/js/jquery.min.js"></script>
    <script src="/layui/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/layui/js/xadmin.js"></script>

</head>
<body>
<script type="text/javascript"  src="jquery-3.3.1.js" ></script>

<script type="text/javascript">
    function x(i) {
        var f=document.getElementById("ac");
        if(i==1){
            f.action="/danju/cx.do";
        }if(i==2){
            f.action="/student/export.do";
        }
    }
</script>
<body>
<form id="ac" action="#" method="post">
    编号<input type="text" size="12" name="编号" value="" />
    班级<select name="cid">
    <option value="0">请选择</option>
    <option value="1">电子票</option>
    <option value="2">发票</option>
</select>
    <button onclick="x(1)" >查询</button>
    <button onclick="x(2)" >导出</button></br>
</form>
<a href="/student/queryAll.do">返回</a>
<form action="/student/upload.do" method="post"  enctype="multipart/form-data">
    <input type="file" name="filename"/>
    <input type="submit" value="上传"  />
</form>

<%--<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="add">添加</button>
    </div>
</script>--%>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<div class="layui-tab layui-tab-card">
    <ul class="layui-tab-title">
        <li class="layui-this">单据管理</li>
        <li>订单管理</li>
    </ul>
    <div class="layui-tab-content" style="height: 100px;">
        <div class="layui-tab-item layui-show"><table  class="layui-hide" id="test" lay-filter="test"></table></div>
        <div class="layui-tab-item">2</div>
    </div>
</div>


<script>
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem:'#test'
            ,url:'/danju/queryAll.do'
            ,toolbar:'#toolbarDemo'
            ,title:'用户数据表'
            ,totalRow: true
            ,cols:[[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'id', title:'ID', width:"15%", sort: true, totalRow: true}
                ,{field:'bianhao', title:'编号', width:"12%",sort: true, totalRow: true}
                ,{field:'money', title:'金额', width:"13%",  sort: true}
                ,{field:'ty', title:'单据种类', templet:'<div>{{d.ty.type}}</div>', width:"15%",  sort: true}
                ,{field:'test', title:'备注', width:"25%",  sort: true}
                ,{fixed: 'right',width:"10%", title:'操作', toolbar: '#barDemo', width:150}
            ]]
          /*  ,limit:3
            ,limits:[3,10]
            ,page: true*/
        });
        //监听行工具事件
      table.on('tool(test)', function(obj){
            var data = obj.data;
            if(obj.event === 'del'){
                layer.confirm('真的删除行么', function(index){
                    $.get("/danju/delect.do?id="+data.id,function(data,status){

                    })
                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    //向服务端发送删除指令
                });

            } else if(obj.event === 'edit'){
                alert(data.id)
                layer.open({
                    type: 2,
                    area: ['700px', '600px'],
                    content:'/danju/queryByID.do?id='+data.id,

                    cancel: function(index, layero){
                        if(confirm('确定要关闭么')){ //只有当点击confirm框的确定时，该层才会关闭
                            layer.close(index)
                        }
                        return false;
                    },
                    end: function () {
                        location.reload();
                    }
                });
            }
        });
        /*table.on('toolbar(test)', function(obj){
            var data = obj.data;
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;
            };*/
           /* if(obj.event === 'add')
                layer.open({
                    type: 2,
                    area: ['700px', '600px'],
                    content:'/student/toAdd.do',
                    cancel: function(index, layero){
                        if(confirm('确定要关闭么')){ //只有当点击confirm框的确定时，该层才会关闭
                            layer.close(index)
                        }
                        return false;
                    },
                    end: function () {
                        location.reload();
                    }
                });
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;
            };
        });*/
    });
</script>
</body>
</html>