package Homework4;

public class Main {
    public static void main(String[] args) {
    Employee a1 = new Employee("Roflan Roman Petrovich", 27, 43500);
    Employee a2 = new Employee("Cumberbatch Benedict Vasiliyevich", 44, 70000);
    Employee a3 = new Employee("Sidorenko Ivan Mikhalych", 45, 45000);
    Employee a4 = new Employee("Zubenko Mikhail Petrovich", 46, 44000);
    Employee a5 = new Employee("Ponasenkov Evgeniy Nikolaevich", 38, 68000);
        //task 4
        System.out.println(a1.getName());
        System.out.println(a2.getName());
        System.out.println(a3.getName());
        //task 5
        Employee[] arr = {a1, a2, a3, a4, a5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge() > 40) {
                System.out.println("Имя сотрудника: " + arr[i].getName() + "." +
                        " Возраст сотрудника: " + arr[i].getAge() + "." +
                        " Зарплата сотрудника: " + arr[i].getSalary() + "." );
            }
        }
        //task 7
        Employee[] list = {a1, a2, a3, a4, a5};
        double sumSalary = 0;
        double sumAge = 0;
        double averageSalary = 0;
        double averageAge = 0;
        for (int i = 0; i < list.length; i++) {
            sumSalary += list[i].getSalary();
            sumAge += list[i].getAge();
            averageSalary = (sumSalary / list.length);
            averageAge = (sumAge / list.length);




        }
        System.out.println("Средняя зарплата сотрудников: " + averageSalary +".");
        System.out.println("Средний возраст сотрудников: " + averageAge + ".");





    }
    //task 6
    //Не придумал, как написать метод, принимающий на вход в массив объекты класса Employee, поэтому инициализировал их уже внутри метода
    public void SalaryControl() {
        Employee a1 = new Employee("Roflan Roman Petrovich", 27, 43500);
        Employee a2 = new Employee("Cumberbatch Benedict Vasiliyevich", 44, 70000);
        Employee a3 = new Employee("Sidorenko Ivan Mikhalych", 45, 45000);
        Employee a4 = new Employee("Zubenko Mikhail Petrovich", 46, 44000);
        Employee a5 = new Employee("Ponasenkov Evgeniy Nikolaevich", 38, 68000);
        Employee[] list = {a1, a2, a3, a4, a5};

        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() > 45) {
                list[i].setSalary(list[i].getSalary() + 5000);
            }
        }



    }
}
