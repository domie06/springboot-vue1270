const base = {
    get() {
        return {
            url : "http://localhost:8080/yiyuandanganguanlixitong/",
            name: "yiyuandanganguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yiyuandanganguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院档案管理系统"
        } 
    }
}
export default base
