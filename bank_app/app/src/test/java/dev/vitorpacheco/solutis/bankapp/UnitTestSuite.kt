package dev.vitorpacheco.solutis.bankapp

import dev.vitorpacheco.solutis.bankapp.extensions.BigDecimalExtensionKtTest
import dev.vitorpacheco.solutis.bankapp.extensions.DateExtensionKtTest
import dev.vitorpacheco.solutis.bankapp.extensions.StringExtensionsKtTest
import dev.vitorpacheco.solutis.bankapp.loginScreen.LoginInteractorTest
import dev.vitorpacheco.solutis.bankapp.loginScreen.LoginPresenterUnitTest
import dev.vitorpacheco.solutis.bankapp.statementsScreen.StatementsInteractorTest
import dev.vitorpacheco.solutis.bankapp.statementsScreen.StatementsPresenterUnitTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    LoginPresenterUnitTest::class,
    LoginInteractorTest::class,

    StatementsPresenterUnitTest::class,
    StatementsInteractorTest::class,

    BigDecimalExtensionKtTest::class,
    DateExtensionKtTest::class,
    StringExtensionsKtTest::class
)
class UnitTestSuite