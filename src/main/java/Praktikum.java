public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        Account account1 = new Account("ROMAN KOSTYUK SERGEEVICH");
        System.out.println(account1.checkNameToEmboss());

        /*Account account2 = new Account(" ROMAN KOSTYUK");
        System.out.println(account2.checkNameToEmboss());
        Account account3 = new Account("ROMAN KOSTYUK");
        System.out.println(account3.checkNameToEmboss());
        Account account4 = new Account("ROMAN KOSTYUK ");
        System.out.println(account4.checkNameToEmboss());
        Account account5 = new Account("ROMANKOSTYUK");
        System.out.println(account5.checkNameToEmboss());*/
    }

}
