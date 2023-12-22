class Company {
	var name: String = ""
		get() {
            print("Setter is called")
            return field
        	 }
             	 // getter
		set(value) {
            if(value.isEmpty())
            {
                print("Invalid name")
            }		 // setter
			field = value
		}
}
fun main(args: Array<String>) {
	val c = Company()
	c.name = "GeeksforGeeks" // access setter
	println(c.name)		 // access getter 
}
