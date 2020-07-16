<template>
    <div class="header_item">
        <ul class="layui-nav layui-bg-black" lay-filter="">
            <li class="layui-nav-item logo"><router-link :to="{ name:'info'}">用户管理系统</router-link></li>
            <li class="layui-nav-item layui-this"><router-link :to="{ name:'info' }">主页</router-link></li>
            <li class="layui-nav-item"><router-link :to="{ name:'about' }">关于我们</router-link></li>
            <li class="layui-nav-item" style="margin-left: 930px"><router-link :to="{ name:'add' }">添加角色</router-link></li>
        </ul>
    </div>
</template>

<script>
    import '../static/layui/layui'

    export default {
        name: "Header"
    }
</script>

<style scoped>
    @import "../static/layui/css/layui.css";
    *{
        margin: 0;
        padding: 0;
        list-style: none;
    }
    .logo{
        margin-left: 100px;
    }

</style>
