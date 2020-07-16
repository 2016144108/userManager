<template>
    <div class="information_item">
        <div id="" class="body_box">
            <div id="content_box" class="content_box">
                <div id="head" class="head">
                    <p>联系我们</p>
                </div>
                <div id="adress" class="adress">
                    <p class="layui-icon layui-icon-location"></p>
                    <p>江苏省常州市江苏理工学院</p>
                    <p>http://www.jstu.edu.cn/</p>
                </div>
                <div id="connection" class="connection">
                    <p>联系方式</p>
                    <p>移动电话：18702365120</p>
                    <p>QQ：2864532119</p>
                    <p>电子邮件：2864512997@136.com</p>
                    <p>详细地址：江苏省常州市江苏理工学院计算机工程学院</p>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import '../../static/layui/layui'
    export default {
        name: "Information"
    }
</script>

<style scoped>
    @import '../../static/layui/css/layui.css';
    *{
        margin: 0;
        padding: 0;
        list-style: none;
    }
    .information_item{
        width: 1300px;
        margin:0 auto;
    }
    *{
        margin: 0;
        padding: 0;
        list-style: none;
    }
    .head_box{
        width: 100%;
        height: 50px;
    }
    .logo{
        width: 100px;
        height: 50px;
        margin-left: 150px;
    }
    .logo img{
        height:80%;
        padding-top: 5px;
    }
    .head_up{
        width:100%;
        height: 50px;
    }
    .head_up ul{
        width:300px;
        height: 50px;
        margin-left:210px;
        margin-top: -50px;
    }
    .head_up ul a{
        width:70px;
        height: 50px;
        float: left;
        line-height: 50px;
        text-align: center;
    }
    .head_up ul a li{
        width:70px;
        height: 50px;
        line-height: 50px;
        text-align: center;
    }
    .head_content{
        position: absolute;
        display: none;
        top: 50px;
        margin-bottom: 50px;
        width: 100%;
        height: 200px;
        background-color: rgba(255, 255, 255, 0.9);
    }
    .head_content{
        position: absolute;
        display: none;
        top: 50px;
        margin-bottom: 50px;
        width: 100%;
        height: 200px;
        background-color: rgba(255, 255, 255, 0.9);
    }
    .footer_box{
        width: 100%;
        height: 200px;
        background-color: rgb(29, 29, 29);
    }
    .footer_box p{
        margin-top:5px ;
        margin-left: 100px;
        font-size: 15px;
        color: white;
    }
    .footer_box p:nth-of-type(1){
        padding-top:20px ;
    }
    .footer_box ul{
        margin-left: 80px;
        margin-top: 5px;
    }
    .footer_box ul li{
        float: left;
        font-size: 15px;
        color: white;
        margin-left: 20px;
    }
    .body_box{
        width: 100%;
        margin-bottom: 400px;
        background-color: rgb(241, 241, 241);
        position: relative;
    }
    .labelbox label:nth-of-type(1){
        margin-left: 60px;
    }
    .labelbox label:nth-of-type(2){
        color:rgb(42, 111, 240);
    }
    .labelbox{
        margin-bottom: 20px;
    }
    .head_content .page:nth-of-type(1){
        width: 100%;
        height: 100%;
        background: white;
        display: none;
    }
    .head_content .page:nth-of-type(2){
        width: 100%;
        height: 100%;
        background: white;
        display: none;
    }
    .head_content .page ul{
        width: 800px;
        height: 100%;
        margin-left: 100px;
    }
    .head_content .page ul a{
        float: left;
        margin-right: 150px;
        margin-left: 50px;
    }
    .head_content .page ul a li{
        height:40px;
        line-height: 40px;
    }
    .head_content .page ul a li:hover{
        color: rgb(42, 111, 240);
    }
    .pic_box{
        width: 100%;
    }
    .pic_box img{
        width: 100%;
    }
    .content_box{
        position: absolute;
        width: 86%;
        margin-left: 7%;
        background-color: white;
        box-shadow: 0 0 3px rgb(182, 182, 182);
        margin-top:-370px ;
        height: 500px;
    }
    .head{
        width: 94%;
        padding-top:36px;
        margin-left: 3%;
        border-bottom: 1px solid rgb(230, 230, 230);
    }
    .head p{
        width: 56px;
        padding-bottom: 10px;
        font-weight: bolder;
        border-bottom: 3px solid rgb(104, 157, 255);
    }
    .adress{
        width: 94%;
        margin-left: 3%;
        padding-top: 45px;
        height: 75px;
        border-bottom: 1px solid rgb(230, 230, 230);
    }
    .adress p:nth-of-type(1){
        font-weight: bolder;
        color: red;
        font-size: 24px;
        margin: 0 0 0 20px;
    }
    .adress p:nth-of-type(2){
        margin: -32px 0 0 55px;
        font-weight: bold;
    }
    .adress p:nth-of-type(3){
        margin: 3px 0 0 55px;
    }
    .connection{
        width: 94%;
        margin-left: 3%;
        padding-top: 36px;
    }
    .connection p:nth-of-type(1){
        margin-left: 24px;
        color: rgb(104, 157, 255);
        border-left: 3px solid rgb(104, 157, 255);
        padding-left: 2px;
    }
    .connection p:nth-of-type(2){
        margin-left: 24px;
        margin-top: 30px;
    }
    .connection p:nth-of-type(3){
        margin-left: 24px;
        margin-top: 30px;
    }
    .connection p:nth-of-type(4){
        margin-left: 24px;
        margin-top: 30px;
    }
    .connection p:nth-of-type(5) {
        margin-left: 24px;
        margin-top: 30px;
    }
</style>
