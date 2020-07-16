<template>
    <div class="info_item">
        <Alert :msg="msg" @goNull="handleunset"/>
        <Tables/>
    </div>
</template>

<script>
    import Alert from '../components/Alert'
    import Tables from '../components/info/Tables'

    export default {
        name: "Info",
        async created(){
            if(this.$route.query.msg){
                this.msg = this.$route.query.msg;
            }
        },
        data(){
            return{
                msg: '',
            };
        },
        components: {
            Alert,
            Tables,
        },
        methods: {
            handleunset(e){
                this.msg = e;
                this.$router.push({name:'info'})
            },
        },
        watch: {
            '$route' (to, from) {
                this.$router.go(0);
            }
        },
    }
</script>

<style scoped>
    *{
        margin: 0;
        padding: 0;
        list-style: none;
    }
    .info_item{
        width: 1300px;
        margin:20px auto 0;
    }
</style>
