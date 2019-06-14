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
    <title>交接</title>
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
<form class="layui-form" method="post">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">交接人</label>
            <div class="layui-input-inline">
                <input type="tel" name="jiaojie"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">接受人</label>
            <div class="layui-input-block">
                <input type="tel" name="jieshou"  autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-inline">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="demo1">查询</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </div>
</form>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<div class="layui-tab layui-tab-card">
    <ul class="layui-tab-title">
        <li class="layui-this">交接管理</li>
    </ul>
    <div class="layui-tab-content" style="height: 100px;">
        <div class="layui-tab-item layui-show"><table  class="layui-hide" id="test" lay-filter="test"></table></div>
    </div>
</div>


<script>
    layui.use(['table','form'], function () {
        var table = layui.table;
        var layer = layui.layer;
        var form=layui.form;
        //渲染表格

        form.on('submit(demo1)',function (data) {
            table.reload("test",{
                where:{
                    jiaojie : data.field.jiaojie,
                    jieshou : data.field.jieshou
                }
            })
            return false;
        });

        table.render({
            elem:'#test'
            ,url:'/jiaojie/queryAll.do'
            ,toolbar:'#toolbarDemo'
            ,title:'交接表'
            ,totalRow: true
            ,cols:[[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'id', title:'ID', width:"10%", sort: true, totalRow: true}
                ,{field:'money', title:'金额', width:"10%",sort: true, totalRow: true}
                ,{field:'jiaojie', title:'交接人', width:"10%",  sort: true}
                ,{field:'jieshou', title:'接受人', width:"10%",  sort: true}
                ,{field:'jiaojietime', title:'交接时间', width:"20%",  sort: true}
                ,{field:'test', title:'备注', width:"20%",  sort: true}
                ,{fixed: 'right',width:"20%", title:'操作', toolbar: '#barDemo', width:150}
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
                    $.get("/jiaojie/delect.do?id="+data.id,function(data,status){

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
                    content:'/jiaojie/queryByID.do?id='+data.id,

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