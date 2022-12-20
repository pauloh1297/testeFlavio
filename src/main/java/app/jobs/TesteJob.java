/**
 * As alterações neste arquivo podem causar um comportamento incorreto e serão
 * perdidas se a IDE precisar atualizá-lo
 */
package app.jobs;

import cronapi.database.TransactionManager;
import cronapp.framework.scheduler.SchedulerConfigurer;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.stereotype.Component;

import cronapi.Var;

/**
 * Tarefa Agendada teste
 *
 * teste
 */
@Component
@DisallowConcurrentExecution
public class TesteJob implements Job {

  @Override
  public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    try {
      //teste
      blockly.Teste.Executar();
      TransactionManager.commit();
    } catch (Exception e) {
      TransactionManager.rollback();
      throw new JobExecutionException(e);
    } finally {
      TransactionManager.close();
      TransactionManager.clear();
    }
  }

  @Bean(name = "testeJobDetail")
  public JobDetailFactoryBean testeJobDetail() {
    return SchedulerConfigurer.createJobDetail(this.getClass());
  }

  /**
   * teste
   * A cada 10 segundos
   */
  @Bean(name = "testeJobTesteTrigger")
  public CronTriggerFactoryBean testeJobTesteTrigger(@Qualifier("testeJobDetail") JobDetail jobDetail) {

    return SchedulerConfigurer.createCronTrigger(jobDetail, "*/10 * * * * ?");
  }
}