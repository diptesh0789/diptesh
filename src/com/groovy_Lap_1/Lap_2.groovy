package com.groovy_Lap_1;

 class Employee {
    def name; def age
	Employee(name, age)
	{this.name=name
		this.age=age

	}
	
	def increaseAgeBy(ageval)
	{ this.age+= ageval;
	}
	
	def displayInfo(){
		println "Name is $name and age is $age"
	}

}

def employee = new Employee("Diptesh", 24)
employee.increaseAgeBy(2)
employee.displayInfo()