package bitcamp.listener;

import bitcamp.context.ApplicationContext;

// 어플리케이션 상태 변경을 알림 받을 객체의 호출 규칙
public interface ApplicationListener {
  default void onStartup(ApplicationContext ctx) throws Exception {
  }

  ;

  default void onShutdown(ApplicationContext ctx) throws Exception {
  }

  ;
}
