import static org.junit.Assert.*
import static org.junit.matchers.JUnitMatchers.*

import pages.*

this.metaClass.mixin(cuke4duke.GroovyDsl)

Given(~"I am on the Google search page") { ->
	to GoogleHomePage
	waitFor { at(GoogleHomePage) }
}

When(~"I search for \"(.*)\"") { String query ->
	page.searchField.value(query)
	page.searchButton.click()
}

Then(~"I am at the results page") {
	assert at(GoogleResultsPage)
}

Then(~"The first link should be \"(.*)\"") { String text ->
	waitFor { page.results }
	assertThat page.resultLink(0).text(), containsString(text)
}