<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/05/13
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <title>修改交接</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">


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


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>修改单据</legend>
</fieldset>

<form class="layui-form" action="../jiaojie/update.do">
  <div class="layui-form-item">
        <div class="layui-input-block">
            <input type="hidden" value="${jiaojie.id}" name="id" required  lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">金额：</label>
        <div class="layui-input-block">
            <input type="text" value="${jiaojie.money}" name="money" required  lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">交接人：</label>
        <div class="layui-input-block">
            <input type="text" value="${jiaojie.jiaojie}" name="jiaojie" required  lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">接手人：</label>
        <div class="layui-input-block">
            <input type="date" value="${jiaojie.jieshou}" name="jieshou" required  lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">交接时间：</label>
        <div class="layui-input-block">
            <input type="text"  value="${jiaojie.jiaojietime}" name="jiaojietime" required  lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">备注：</label>
        <div class="layui-input-block">
            <input type="text" value="${jiaojie.test}" name="test" required  lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" id="sub" class="layui-btn" lay-submit lay-filter="formDemo">确定修改</button>
        </div>
    </div>
</form>

<!-- 示例-970 -->
<ins class="adsbygoogle" style="display:inline-block;width:970px;height:90px" data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>


<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date1'
            ,type: 'date'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');
        // form.on('submit(demo1)', function(data){
        //     form.submit();
        //     return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        // });
    });
    $("#sub").click(function () {
        var index=parent.layer.getFrameIndex(window.name);
        parent.layer.close(index);
    });
</script>
<%--<script>
    layui.use('form', function(data){
        var form = layui.form;
        $("sub").click(function () {
            var index=parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
        });
        form.on('submit(*)', function(data){
        })

    });

</script>--%>
</body>
</html>