<template>
    <div class="detail_item">
        <InforTable :label="label" :user="user"/>
    </div>
</template>

<script>
    import InforTable from '../components/InforTable'

    export default {
        name: "Detail",
        data(){
            return{
                user: {
                    name: '',
                    phone: '',
                    email: '',
                    education: '',
                    school: '',
                    job: '',
                    intro: '',
                },
                label: '编辑用户',
            }
        },
        components: {
            InforTable,
        },
        async created(){
            let id = this.$route.query.id;
            this.user =await this.edit(id);
            console.log(this.user);
        },
        methods: {
            /*async edit(id){
                const resp = await this.$http.get('http://localhost:3000/users/'+id);
                console.log(resp.body);
                return resp.body;
            },*/
        }
    }
</script>

<style scoped>
    *{
        margin: 0;
        padding: 0;
        list-style: none;
    }
    .detail_item{
        width: 1300px;
        margin: 0 auto;
    }
</style>
