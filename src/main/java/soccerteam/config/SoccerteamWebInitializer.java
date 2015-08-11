package soccerteam.config;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import soccerteam.web.WebConfig;

public class SoccerteamWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class };
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}