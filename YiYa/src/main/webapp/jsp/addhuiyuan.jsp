<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../layui/lib/layuiE/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
    <legend>会员添加</legend>
</fieldset>

<form class="layui-form" action="/huiyuan/addhuiyuan.do">

    <div class="layui-form-item">
        <label class="layui-form-label">会员姓名</label>
        <div class="layui-input-block">
            <input type="text" name="name" placeholder="请输入" lay-verify="required" lay-reqtext="用户名是必填项，岂能为空？" autocomplete="off"
                   class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">会员性别</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="男" checked="checked" title="男">
            <input type="radio" name="sex" value="女"  title="女">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">生日</label>
        <div class="layui-input-block">
            <input type="text" name="birthday" placeholder="请选择" id="date1" lay-verify="date" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">电话</label>
        <div class="layui-input-block">
            <input type="text" name="phone" placeholder="请输入" lay-verify="required|number" lay-reqtext="电话不能为空"  autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">地址</label>
        <div class="layui-input-block">
            <input type="text" name="address" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">余额</label>
        <div class="layui-input-block">
            <input type="text" name="money" placeholder="请输入"  autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-inline">
            <textarea name="test" placeholder="你还有啥要说的吗？" style="width: 1000px;" maxlength="250" rows="5" class="layui-textarea"></textarea>
        </div>
    </div>

    <!--<div class="layui-form-item layui-form-text">
      <label class="layui-form-label">编辑器</label>
      <div class="layui-input-block">
        <textarea class="layui-textarea layui-hide" name="content" lay-verify="content" id="LAY_demo_editor"></textarea>
      </div>
    </div>-->
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script src="../layui/lib/layuiE/layui.js" charset="utf-8"></script>

<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date1'
            ,type:'date'
        });


        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        // //自定义验证规则
        // form.verify({
        //     title: function(value){
        //         if(value.length < 5){
        //             return '标题至少得5个字符啊';
        //         }
        //     }
        //     ,pass: [
        //         /^[\S]{6,12}$/
        //         ,'密码必须6到12位，且不能出现空格'
        //     ]
        //     ,content: function(value){
        //         layedit.sync(editIndex);
        //     }
        // });


        // //监听提交
        // form.on('submit(demo1)', function (data) {
        //     layer.alert(JSON.stringify(data.field), {
        //         title: '最终的提交信息'
        //     })
        //     return false;
        // });

        //表单初始赋值
        // form.val('example', {
        //     "username": "贤心" // "name": "value"
        //     , "password": "123456"
        //     , "interest": 1
        //     , "like[write]": true //复选框选中状态
        //     , "close": true //开关状态
        //     , "sex": "女"
        //     , "desc": "我爱 layui"
        // })

    });
</script>

</body>
</html>
