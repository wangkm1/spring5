import com.wkm.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: wangkm
 * @Date: 2020/3/10 17:25
 */
public class Test1 {
	@Test
	public void test1(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (int i = 0; i <beanDefinitionNames.length ; i++) {
			System.out.println(beanDefinitionNames[i]);
		}
	}
}
