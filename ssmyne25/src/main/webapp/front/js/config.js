
var projectName = '婚恋网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '活动信息',
	url: './pages/huodongxinxi/list.html'
}, 

{
	name: '论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmyne25/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","创建账户"],"menu":"会员","menuJump":"列表","tableName":"huiyuan"}],"menu":"会员管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论","用户参加","会员参加"],"menu":"活动信息","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"活动类型","menuJump":"列表","tableName":"huodongleixing"}],"menu":"活动类型管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"参加信息","menuJump":"列表","tableName":"canjiaxinxi"}],"menu":"参加信息管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"签线服务","menuJump":"列表","tableName":"qianxianfuwu"}],"menu":"签线服务管理"},{"child":[{"buttons":["查看","修改","删除","消费"],"menu":"会员账户","menuJump":"列表","tableName":"huiyuanzhanghu"}],"menu":"会员账户管理"},{"child":[{"buttons":["查看","删除"],"menu":"充值信息","menuJump":"列表","tableName":"chongzhixinxi"}],"menu":"充值信息管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"消费信息","menuJump":"列表","tableName":"xiaofeixinxi"}],"menu":"消费信息管理"},{"child":[{"buttons":["查看","审核","删除"],"menu":"会员参加","menuJump":"列表","tableName":"huiyuancanjia"}],"menu":"会员参加管理"},{"child":[{"buttons":["查看","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["查看","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","用户参加","会员参加"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"参加信息","menuJump":"列表","tableName":"canjiaxinxi"}],"menu":"参加信息管理"},{"child":[{"buttons":["查看"],"menu":"签线服务","menuJump":"列表","tableName":"qianxianfuwu"}],"menu":"签线服务管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","用户参加","会员参加"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","签线"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"签线服务","menuJump":"列表","tableName":"qianxianfuwu"}],"menu":"签线服务管理"},{"child":[{"buttons":["查看","充值"],"menu":"会员账户","menuJump":"列表","tableName":"huiyuanzhanghu"}],"menu":"会员账户管理"},{"child":[{"buttons":["查看","删除","支付"],"menu":"充值信息","menuJump":"列表","tableName":"chongzhixinxi"}],"menu":"充值信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"消费信息","menuJump":"列表","tableName":"xiaofeixinxi"}],"menu":"消费信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"会员参加","menuJump":"列表","tableName":"huiyuancanjia"}],"menu":"会员参加管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","用户参加","会员参加"],"menu":"活动信息列表","menuJump":"列表","tableName":"huodongxinxi"}],"menu":"活动信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"会员","tableName":"huiyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
