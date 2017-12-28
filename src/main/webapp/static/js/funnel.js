$(document).ready(function () {
    var myChart = echarts.init($('#main')[0], 'dark');
    option = {
        title: {
            text: '学习促进小组演示效果',
            subtext: '纯属虚构'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c}%"
        },
        toolbox: {
            feature: {
                dataView: {
                    readOnly: false
                },
                restore: {},
                saveAsImage: {}
            }
        },
        legend: {
            data: ['观看', '感兴趣', '咨询', '加入', '活跃']
        },
        calculable: true,
        series: [{
            name: '漏斗图',
            type: 'funnel',
            left: '10%',
            top: 60,
            //x2: 80,
            bottom: 60,
            width: '80%',
            // height: {totalHeight} - y - y2,
            min: 0,
            max: 100,
            minSize: '0%',
            maxSize: '100%',
            sort: 'descending',
            gap: 2,
            label: {
                normal: {
                    show: true,
                    position: 'inside'
                },
                emphasis: {
                    textStyle: {
                        fontSize: 20
                    }
                }
            },
            labelLine: {
                normal: {
                    length: 10,
                    lineStyle: {
                        width: 1,
                        type: 'solid'
                    }
                }
            },
            itemStyle: {
                normal: {
                    borderColor: '#fff',
                    borderWidth: 1
                }
            },
            data: [{
                value: 60,
                name: '咨询'
            }, {
                value: 40,
                name: '加入'
            }, {
                value: 20,
                name: '活跃'
            }, {
                value: 80,
                name: '感兴趣'
            }, {
                value: 100,
                name: '观看'
            }]
        }]
    };
    myChart.setOption(option);
});