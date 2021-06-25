# page
分页用到工具类
包括PagingInfo、PagingQueryBean、PagingResultBean
使用代码如下

public AjaxResult findAllOneSelf(@RequestBody PagingQueryBean<HeartTravel> query) {
		//创建分页信息
		PagingInfo pageInfo = query.getPageInfo();
		PageHelper.offsetPage(pageInfo.getPageNum()-1*pageInfo.getPageSize(), pageInfo.getPageSize());
		Page<HeartTravel> page = (Page<HeartTravel>) heartTravelService.selectHeartTravelOneSelf(query.getQueryBean());
		pageInfo.setTotal(page.getTotal());
		pageInfo.setPages(page.getPages());
		PagingResultBean<List<HeartTravel>> result = new PagingResultBean<List<HeartTravel>>();
		result.setPageInfo(pageInfo);
		result.setResult(page);
		return AjaxResult.success(result);	
	}
  PageHelper插件需要在pom中添加依赖
  <dependency>
			<groupId>com.github.pagehelper</groupId>
			<artifactId>pagehelper-spring-boot-starter</artifactId>
			<version>1.2.5</version>
		</dependency>
