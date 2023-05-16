public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.

             в строке не меньше 3 и не больше 19 символов,
             в строке есть только один пробел,
             пробел стоит не в начале и не в конце строки.
         */
        if (name.length() >= 3 & name.length() <=19) {
            if (name.charAt(0) != ' ' & name.charAt(name.length() - 1) != ' ' &
                    name.indexOf(' ') == name.lastIndexOf(' ') &
                    name.indexOf(' ') != -1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}