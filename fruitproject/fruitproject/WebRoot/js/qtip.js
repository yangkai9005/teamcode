// 创建工具提示文件加载
$(document).ready(function(){

	// 使用each（）方法来获得每个元素的属性
	$('.detail').each(function(){
		$(this).qtip({
			content: {
				// 设置您要使用的文字图像的HTML字符串，正确的src URL加载图像
				text: '<img class="throbber" src="images/throbber.gif" alt="Loading..." />',
				url: $(this).attr('rel'), // 使用的URL加载的每个元素的rel属性
				title:{
					text: $(this).attr("title"), // 给工具提示使用每个元素的文本标题
					button: '关闭' // 在标题中显示关闭文字按钮
				}
			},
			position: {
				corner: {
					target: 'bottomMiddle', // 定位上面的链接工具提示
					tooltip: 'topMiddle'
				},
				adjust: {
					screen: true // 在任何时候都保持提示屏幕上的
				}
			},
			show: { 
				when: 'mouseover', //或click 
				solo: true // 一次只显示一个工具提示
			},
			hide: 'unfocus',
			style: {
				tip: true, // 设置一个语音气泡提示在指定工具提示角落的工具提示
				border: {
					width: 0,
					radius: 4
				},
				name: 'light', // 使用默认的淡样式
				width: 390 // 设置提示的宽度
			}
		})
	});
	
});