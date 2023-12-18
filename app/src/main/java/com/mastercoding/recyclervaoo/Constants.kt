package com.mastercoding.recyclervaoo

object Constants {
    //Array list and return the ArrayList
    fun getEmployeeData():ArrayList<contacts>{
        // create an arraylist of type employee class
        val employeeList=ArrayList<contacts>()
        val emp1=contacts("Chinmaya Mohapatra","chinmaya@gmail.com")
        employeeList.add(emp1)
        val emp2=contacts("Ram prakash","ramp@gmail.com")
        employeeList.add(emp2)
        val emp3=contacts("OMM Meheta","mehetaom@gmail.com")
        employeeList.add(emp3)
        val emp4=contacts("Hari Mohapatra","harim@gmail.com")
        employeeList.add(emp4)
        val emp5=contacts("Abhisek Mishra","mishraabhi@gmail.com")
        employeeList.add(emp5)
        val emp6=contacts("Sindhu Malhotra","sindhu@gmail.com")
        employeeList.add(emp6)
        val emp7=contacts("Anil sidhu","sidhuanil@gmail.com")
        employeeList.add(emp7)
        val emp8=contacts("Sachin sinha","sinhas@gmail.com")
        employeeList.add(emp8)
        val emp9=contacts("Amit sahoo","sahooamit@gmail.com")
        employeeList.add(emp9)
        val emp10=contacts("Raj kumar","kumarraj@gmail.com")
        employeeList.add(emp10)
        return employeeList






    }
}