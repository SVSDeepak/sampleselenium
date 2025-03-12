package Hooks;

import io.cucumber.java.*;

public class hooksclass1 {
	
	@Before
	public void beforemethod()
	{
		System.out.println("Before ");
	}
	
	@BeforeStep
	public void beforeStepmethod()
	{
		System.out.println("Before Step ");
	}
	
	@After
	public void aftermethod()
	{
		System.out.println("After ");
	}
	
	@AfterStep
	public void afterstepmethod()
	{
		System.out.println("After step ");
	}
	
	
	
}
