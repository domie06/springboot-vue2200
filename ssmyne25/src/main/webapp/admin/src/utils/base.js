const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmyne25/",
            name: "ssmyne25",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmyne25/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "婚恋网站"
        } 
    }
}
export default base
