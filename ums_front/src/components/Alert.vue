<template>
    <div v-if="msg"  class="alert_item">
        <div class="alert">
            <label>{{msg}}</label>
            <span class="layui-icon layui-icon-close" @click="unset"></span>
        </div>
    </div>
</template>

<script>
    import '../static/layui/layui'
    export default {
        name: "Alert",
        props: {
            msg: {
                type: String,
                default: '',
                required: false,
            }
        },
        methods: {
            unset(){
                    this.$emit("goNull",'');
            },
        },
    }
</script>

<style scoped>
    @import "../static/layui/css/layui.css";
    *{
        margin: 0;
        padding: 0;
        list-style: none;
    }
    .alert_item{
        width: 1300px;
        margin: -20px auto 30px;
    }
    .alert{
        background-color: rgba(255, 116, 87, 0.78);
        height: 40px;
        position: relative;
    }
    .alert label{
        height: 40px;
        line-height: 40px;
        color: white;
        position: absolute;
        left: 50px;
    }
    .alert span{
        height: 40px;
        line-height: 40px;
        color: white;
        position: absolute;
        right: 30px;
        cursor: pointer;
    }
</style>
