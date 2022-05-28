class Person {

    public static String name;
    public int averagescore;

    public Person (String name,int averagescore) {

        this.name = name;
        this.averagescore=averagescore;

    }

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1=new Person("Beg�m Kaya",33);
        Person p2=new Person("Ecem Aydo�an",66);
        Person p3=new Person("Alper Mazino�lu",99);
    }

    static String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAveragescore() {
        return averagescore;
    }

    void setAveragescore(int averagescore) {
        this.averagescore = averagescore;
    }


}

//PERSONLARI arrayin i�inde storelan�r
//kullan�c�n�n verd�i inputlar�n total scoreu hesapland�ktan sonra for loop a��l�r
//loopun i�indeki ilk aday g�sterilir
//kullan�c� next derse loop iterate eder cancel derse window kapan�r
//Hire derse Hired succesfully diye module a��l�r
