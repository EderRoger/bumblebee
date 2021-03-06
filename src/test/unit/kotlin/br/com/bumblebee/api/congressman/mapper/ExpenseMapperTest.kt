package br.com.bumblebee.api.congressman.mapper

import br.com.bumblebee.api.congressman.client.model.EXPENSE_CLIENT_MODEL_FIXTURE
import br.com.bumblebee.api.congressman.repository.model.EXPENSE_FIXTURE
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class ExpenseMapperTest {

    @Test
    fun shouldTransformExpenseClientResponseIntoExpense() {
        val expected = listOf(EXPENSE_FIXTURE)
        val actual = toExpenses(listOf(EXPENSE_CLIENT_MODEL_FIXTURE))
        assertThat(actual).isEqualTo(expected)
    }
}
