var Chart_NanNvRenShu = echarts.init(document.getElementById('NanNvRenShu'));
								option_NanNvRenShu = {
									backgroundColor: '',
									xAxis: {
										type: 'category',
										data: ["总计人数", "男生人数", "女生人数"],
										axisLabel: {
											show: true,
											textStyle: {
												color: '#fff'
											},
											fontSize: 25
										},
										offset: 0,
										axisLine: {
											show: false
										}
									},
									yAxis: {
										type: 'value',
										show: false
									},
									series: [
										{
											data: [120, 200, 150],
											type: 'bar',
											label: {
												show: true,
												position: "insideBottom",
												fontSize: 25,
												offset: [0, 0]
											},
											itemStyle: {
												color: 'rgba(128, 128, 128, 0)'
											}
										}
									]
								};
								Chart_NanNvRenShu.setOption(option_NanNvRenShu);