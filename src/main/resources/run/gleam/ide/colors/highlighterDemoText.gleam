import gleam/io

pub type Person {
  Teacher(name: String, subject: String)
  Student(name: String, age: Int)
}

pub fn main() {
  // Example comment
  io.println("Hello World!")
}

pub fn label_parameters(label param: Int) {}