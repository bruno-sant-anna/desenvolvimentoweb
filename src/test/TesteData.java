package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Calendar;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class TesteData {
	
	@Test
	public void testData() {
		try {
			
			assertEquals("24032019", DateUtils.getDateAtualReportName());
			
			assertEquals("'2019-03-24'", DateUtils.formatDateSql(Calendar.getInstance().getTime()));

			assertEquals("2019-03-24", DateUtils.formatDateSqlSimple(Calendar.getInstance().getTime()));

			System.out.println(DateUtils.formatDateSql(Calendar.getInstance().getTime()));
			//		System.out.println(DateUtils.getDateAtualReportName());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
