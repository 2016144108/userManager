<template>
    <div class="add_item">
        <InforTable :label="label" :user="user"/>
    </div>
</template>

<script>
    import InforTable from '../components/InforTable'

    export default {
        name: "Add",
        components: {
            InforTable,
        },
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
                label: '添加用户',
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
    .add_item{
        width: 1300px;
        margin: 0 auto;
    }
</style>
