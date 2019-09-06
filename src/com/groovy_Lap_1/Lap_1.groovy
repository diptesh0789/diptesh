println 'Hello World'

def no =1
no= 'abc'
println no

//List gets converted to an array

def (firstName, lastname, number) = ["Groovy", "Training", 10]
println "There are ${number} students in the ${firstName}${lastname} class"


//Map 

def person = [name: "first", age: 25]
println "Mr $person.name is $person.age years old and will be ${person.age +1} next year"


def values = ['String', true, 10]
println values[0]; println values[1]; println values[2]
println values.size()


def primeNos= [1,3,5,7]

for (number1 in primeNos)
	{println number1
	}
	
	
def multiValues = [['A','Bangalore'], ['B', 'Chennai']] 


def sayHello() {
	println "hello"
}


sayHello()

// similar to java, c

int add(int num1, int num2)
{  	return num1+num2
}

//similar to dynamic languages

def sub(num1, num2) {
	num1 -num2 }

println(add(20,10))
println(sub(20,10))

def mul(int i=10, int j=20)
{println(i*j)
}

mul()


def printMessage(message, ... vals) {
	println message
	if (vals.size()>0)
		println vals[0]
}

printMessage("Hello", "World")
printMessage "HelloWorld", "abc"





//Range

def nos = 1..10
println(nos)

def noso = 1..<10
println(noso)

def chars = 'a'..<'g'
println(chars)

for (x in noso){
	println x
	}
	
	nasa = [1,3,5,7,6,7,8]
	println 'Printing nos'
	print(nasa[0]); print(nasa[-1])
	
	
	nasa[0]=11
	nasa[1..3]=[13,15,17]
	println(nasa)
	
	nasa[1..2] = [4,6]
	println(nasa)

	def lang = ['java', 'python', 'C#', 'Groovy']
	println(lang.reverse())
	println(lang.sort(false))
	
	println(nasa.reverse())
	println(nasa.sort(false))
	
	
	
	