package enums;

public enum Messages {
    WELCOME_MESSAGE("Введите выражение для вычисления с арабскими или римскими целыми числами"),
    BOTH_NUMBERS_EXCEPTION_MESSAGE("Может быть обработано выражение либо с двумя арабскими, либо с двумя римскими целыми числами"),
    LARGER_THAN_ONE_MESSAGE("Результатом выполнения операций с римскими числами должно быть число больше 1"),
    WRONG_FORMAT_MESSAGE("Введено неверное по длине выражение. Пример необходимого формата ввода: 2 + 5"),
    FROM_ONE_TO_TEN_MESSAGE("Могут быть введены арабские или римскиие целые числа в пределах от 1 до 10"),
    WRONG_OPERATION_MESSAGE("Данная операция не предусмотрена. Возможныe операции: +, -, *, /");



    public String getFullMessage() {
        return fullMessage;
    }

    final String fullMessage;

    Messages(String fullMessage) {
        this.fullMessage = fullMessage;
    }
}
