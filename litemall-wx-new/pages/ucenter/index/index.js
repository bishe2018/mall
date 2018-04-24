var util = require('../../../utils/util.js');
var api = require('../../../config/api.js');
var user = require('../../../services/user.js');
var app = getApp();

Page({
    data: {
        userInfo: {
            nickName: '点击登录',
            avatarUrl: 'http://yanxuan.nosdn.127.net/8945ae63d940cc42406c3f67019c5cb6.png'
        },
        hasLogin: false
    },
    onLoad: function (options) {
        // 页面初始化 options为页面跳转所带来的参数
        //获取用户的登录信息
        if (app.globalData.hasLogin) {
            let userInfo = wx.getStorageSync('userInfo');
            this.setData({
                userInfo: userInfo,
                hasLogin: app.globalData.hasLogin
            });
        }else{
            this.setData({
                userInfo: {
                    nickName: '点击登录',
                    avatarUrl: 'http://yanxuan.nosdn.127.net/8945ae63d940cc42406c3f67019c5cb6.png'
                },
                hasLogin: app.globalData.hasLogin
            });
        }
    },
    onReady: function () {

    },
    onShow: function () {

        //获取用户的登录信息
        if (app.globalData.hasLogin) {
            let userInfo = wx.getStorageSync('userInfo');
            this.setData({
                userInfo: userInfo,
                hasLogin: app.globalData.hasLogin
            });
        }

    },
    onHide: function () {
        // 页面隐藏

    },
    onUnload: function () {
        // 页面关闭
    },
    goLogin() {
        // if (!app.globalData.hasLogin) {
        //     wx.navigateTo({url: "/pages/auth/login/login"});
        // }

            wx.showLoading({
            title: '登录中',
            mask: true
        });
        user.checkLogin().catch(() => {
            user.loginByWeixin().then(res => {
            app.globalData.hasLogin = true;
            let userInfo = wx.getStorageSync('userInfo');
            this.setData({
              userInfo: userInfo,
              hasLogin: true
            })
        wx.hideLoading();
    }).catch((err) => {
            wx.hideLoading();
            app.globalData.hasLogin = false;
        util.showErrorToast('微信登录失败');
    });

    });
    },
    goOrder() {
        if (app.globalData.hasLogin) {
            wx.navigateTo({url: "/pages/ucenter/order/order"});
        }
        else {
            wx.navigateTo({url: "/pages/auth/login/login"});
        }
    },
    goCoupon() {
        if (app.globalData.hasLogin) {
            wx.navigateTo({url: "/pages/ucenter/coupon/coupon"});
        }
        else {
            wx.navigateTo({url: "/pages/auth/login/login"});
        }
        ;

    },
    goCollect() {
        if (app.globalData.hasLogin) {
            wx.navigateTo({url: "/pages/ucenter/collect/collect"});
        }
        else {
            wx.navigateTo({url: "/pages/auth/login/login"});
        }
        ;
    },
    goFootprint() {
        if (app.globalData.hasLogin) {
            wx.navigateTo({url: "/pages/ucenter/footprint/footprint"});
        }
        else {
            wx.navigateTo({url: "/pages/auth/login/login"});
        }
        ;
    },
    goAddress() {
        if (app.globalData.hasLogin) {
            wx.navigateTo({url: "/pages/ucenter/address/address"});
        }
        else {
            wx.navigateTo({url: "/pages/auth/login/login"});
        }
        ;
    },
    exitLogin: function () {
        var that = this;
        wx.showModal({
            title: '',
            confirmColor: '#b4282d',
            content: '退出登录？',
            success: function (res) {
                if (res.confirm) {
                    wx.removeStorageSync('token');
                    wx.removeStorageSync('userInfo');

                    wx.switchTab({
                        url: '/pages/ucenter/index/index'
                    });
                    app.globalData.hasLogin = false;
                    that.setData({
                        userInfo: {
                            nickName: '点击登录',
                            avatarUrl: 'http://yanxuan.nosdn.127.net/8945ae63d940cc42406c3f67019c5cb6.png'
                        },
                        hasLogin: false
                    })
                }
            }
        })

    }
})