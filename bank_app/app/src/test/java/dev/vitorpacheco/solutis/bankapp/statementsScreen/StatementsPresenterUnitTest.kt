package dev.vitorpacheco.solutis.bankapp.statementsScreen

import org.junit.Assert.*
import org.junit.Test
import java.lang.ref.WeakReference

class StatementsPresenterUnitTest {

    @Test
    fun `presentStatementsData com valores válidos o método displayStatementsData deve ser chamado`() {
        val statementsPresenter = StatementsPresenter()
        val statementsResponse = StatementsResponse()

        val statementsPresenterOutputSpy = StatementsPresenterOutputSpy()
        statementsPresenter.output = WeakReference(statementsPresenterOutputSpy)

        statementsPresenter.presentStatementsData(statementsResponse)

        assertTrue(statementsPresenterOutputSpy.isDisplayLoginMetaDataCalled)
    }

    @Test
    fun `presentLoginData com valores inválidos o método displayLoginData não deve ser chamado`() {
        val statementsPresenter = StatementsPresenter()

        val statementsPresenterOutputSpy = StatementsPresenterOutputSpy()
        statementsPresenter.output = WeakReference(statementsPresenterOutputSpy)

        statementsPresenter.presentStatementsData(null)

        assertFalse(statementsPresenterOutputSpy.isDisplayLoginMetaDataCalled)
    }

    private class StatementsPresenterOutputSpy : StatementsActivityInput {

        var isDisplayLoginMetaDataCalled = false
        var loginViewModelCopy: StatementsViewModel? = null

        override fun displayStatementsData(viewModel: StatementsViewModel?) {
            isDisplayLoginMetaDataCalled = true
            loginViewModelCopy = viewModel
        }

    }

}