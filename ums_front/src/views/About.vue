<template>
    <div class="about_item">
        <Information/>
    </div>
</template>

<script>
    import Information from '../components/about/Information'

    export default {
        name: "About",
        components: {
            Information,
        }
    }
</script>

<style scoped>
    *{
        margin: 0;
        padding: 0;
        list-style: none;
    }
    .about_item{
        width: 1300px;
        margin:0 auto;
    }
</style>
