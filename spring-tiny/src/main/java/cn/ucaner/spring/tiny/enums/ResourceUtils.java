package cn.ucaner.spring.tiny.enums;

/**
* @Package：cn.ucaner.spring.tiny.enums   
* @ClassName：ResourceUtils   
* @Description：   <p> ResourceUtils 
* 
* 资源工具类  - 加载资源
* </p>
* @Modify By：   
* @Modify marker：   
* @version    V1.0
 */
public enum ResourceUtils {
	
	CLASSPATH_URL_PREFIX("classpath:");
	
	private String ResourceUrl;
	
	ResourceUtils(String ResourceUrl){
		this.ResourceUrl=ResourceUrl;
		
	}

	public String getResourceUrl() {
		return ResourceUrl;
	}
}
