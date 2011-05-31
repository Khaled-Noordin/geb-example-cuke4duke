import geb.Browser
import geb.binding.BindingUpdater
import geb.report.ScreenshotAndPageSourceReporter

this.metaClass.mixin(cuke4duke.GroovyDsl)

def bindingUpdater
Before() { scenario ->
	bindingUpdater = new BindingUpdater(binding, new Browser())
	bindingUpdater.initialize()
}

After() { scenario ->
	bindingUpdater.remove()
	
	// cuke4duke doesn't provide a way to get the name of the scenario.
	// If it did, you could add reporting (i.e. dumping the page source)
	// by the following code.
	
	// def reportsDir = new File("target/geb-output")
	// def reportName = scenario.name
	
	// new ScreenshotAndPageSourceReporter(reportsDir).writeReport(reportName, browser)
}