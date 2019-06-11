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

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="/layui/css/font.css">
    <link rel="stylesheet" href="/layui/css/xadmin.css">
    <link rel="stylesheet" href="../layui/css/xadmin.css">
    <script src="/layui/js/jquery.min.js"></script>
    <script src="/layui/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="/layui/js/xadmin.js"></script>

</head>
<body>
<!-- 顶部开始 -->
<div class="container">
    <div class="logo"><a href="index.html">快乐肥仔餐饮后台系统 v1.0</a></div>


    <ul class="layui-nav left fast-add" lay-filter="">

        <li class="layui-nav-item">
            <div class="left_open">
                <i title="展开左侧栏" class="iconfont">信息</i>
            </div>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">会员管理</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('会员信息列表','http://www.baidu.com')"><i
                        class="iconfont">&#xe6a2;</i>会员信息列表</a></dd>
                <dd><a onClick="x_admin_show('会员信息添加','http://www.baidu.com')"><i
                        class="iconfont">&#xe6a8;</i>会员信息添加</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">订单管理</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('预定管理','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>预定管理</a></dd>
                <dd><a onClick="x_admin_show('预定单管理','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>预定单管理</a></dd>
                <dd><a onClick="x_admin_show('外卖管理','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>外卖管理</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">菜品管理</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('菜单管理','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>菜单管理</a></dd>
                <dd><a onClick="x_admin_show('菜品类别','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>菜品类别</a></dd>
                <dd><a onClick="x_admin_show('全部菜品','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>全部菜品</a></dd>
                <dd><a onClick="x_admin_show('特色菜','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>特色菜</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">财务管理</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('单据管理','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>单据管理</a></dd>
                <dd><a onClick="x_admin_show('交接管理','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>交接管理</a></dd>
                <dd><a onClick="x_admin_show('关账管理','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>关账管理</a></dd>
                <dd><a onClick="x_admin_show('优惠卷','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>优惠卷</a></dd>
                <dd><a onClick="x_admin_show('促销方案','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>促销方案</a></dd>
                <dd><a onClick="x_admin_show('营业额外收入','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>营业额外收入</a></dd>
                <dd><a onClick="x_admin_show('营业额外支出','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>营业额外支出</a></dd>
                <dd><a onClick="x_admin_show('充值管理','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>充值管理</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">采购管理</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('原材料信息','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>原材料信息</a></dd>
                <dd><a onClick="x_admin_show('采购方式管理','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>采购方式管理</a></dd>
                <dd><a onClick="x_admin_show('销售计划','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>销售计划</a></dd>
                <dd><a onClick="x_admin_show('采购计划','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>采购计划</a></dd>
                <dd><a onClick="x_admin_show('采购审核管理','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>采购审核管理</a></dd>
                <dd><a onClick="x_admin_show('采购单管理','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>采购单管理</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">库存管理</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('入库管理','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>入库管理</a></dd>
                <dd><a onClick="x_admin_show('实时库存','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>实时库存</a></dd>
                <dd><a onClick="x_admin_show('盘库管理','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>盘库管理</a></dd>
                <dd><a onClick="x_admin_show('菜库单管理','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>菜库单管理</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">数据管理</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('菜品统计','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>菜品统计</a></dd>
                <dd><a onClick="x_admin_show('食材费用统计','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>食材费用统计</a></dd>
                <dd><a onClick="x_admin_show('其他费用统计','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>其他费用统计</a></dd>
            </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">系统管理</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('菜单管理','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>菜单管理</a></dd>
                <dd><a onClick="x_admin_show('总店设置向导','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>总店设置向导</a></dd>
                <dd><a onClick="x_admin_show('门店初始化','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>门店初始化</a></dd>
                <dd><a onClick="x_admin_show('总店管理','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>总店管理</a></dd>
                <dd><a onClick="x_admin_show('门店管理','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>门店管理</a></dd>
                <dd><a onClick="x_admin_show('员工管理','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>员工管理</a></dd>
                <dd><a onClick="x_admin_show('权限管理','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>权限管理</a></dd>
            </dl>
        </li>

    </ul>


    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('个人信息','http://www.baidu.com')">个人信息</a></dd>
                <dd><a onClick="x_admin_show('切换帐号','http://www.baidu.com')">切换帐号</a></dd>
                <dd><a href="login.html">退出</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item to-index"><a href="#">前台首页</a></li>
    </ul>
</div>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav">
    <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6eb;</i>
                    <cite>门店信息</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li><a _href="html/welcome.html"><i class="iconfont">&#xe6a7;</i><cite>门店信息列表</cite></a></li>
                </ul>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="layui-icon">&#xe612;</i>
                    <cite>个人信息</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li><a _href="html/unicode.html"><i class="iconfont">&#xe6a7;</i><cite>个人信息</cite></a></li>
                    <li><a _href="html/form1.html"><i class="iconfont">&#xe6a7;</i><cite>修改密码</cite></a></li>
                </ul>
            </li>


            <li>
                <a href="javascript:;">
                    <i class="layui-icon">&#xe621;</i>
                    <cite>文件管理</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li><a _href="html/grid.html"><i class="iconfont">&#xe6a7;</i><cite>文件</cite></a></li>
                </ul>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="layui-icon">&#xe659;</i>
                    <cite>资产管理</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="/student/queryAll.do">
                            <i class="iconfont">&#xe6e4;</i>
                            <cite>资产信息</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="layui-icon">&#xe617;</i>
                    <cite>桌台管理</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="/student/queryAll.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>桌台信息</cite>
                        </a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="layui-icon">&#xe614;</i>
                    <cite>队列设置</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="/student/queryAll.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>队列列表</cite>
                        </a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="layui-icon">&#xe613;</i>
                    <cite>排队管理</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="/student/queryAll.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>排队列表</cite>
                        </a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe69e;</i>
                    <cite>堂口管理</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="/student/queryAll.do">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>堂口列表</cite>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>
<!-- <div class="x-slide_left"></div> -->
<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='html/welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
        </div>
    </div>
</div>
<div class="page-content-bg"></div>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->
<!-- 底部开始 -->
<!--<div class="footer">
    <div class="copyright">Copyright ©2019 L-admin v2.3 All Rights Reserved</div>
</div>-->
<!-- 底部结束 -->
</body>
</html>
