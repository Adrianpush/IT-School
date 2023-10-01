Classes Book and Author are designed as data classes. They have no other methods except getters and setters. The book
class incorporates a list of Author as field.

The Member class has String fields for firstName, lastName, address. Enum AccountStatus is a field in the Member class
that signals if a member is allowed to borrow books. The field borrowedBooks is a HashMap that stores the book object as
key and the date it's supposed to be returned to the library as a LocalDateTime object. The constructor for the Member
class is public, but all the other methods are hidden behind the access modifier protected. The goal is to expose only
the
methods in the Library class.

The Library class has the following fields:

- a String name ( the name of the library)
- a HashMap<Book, Integer> that holds the books the library has as keys and the number of copies as values.
- a HashSet<Member> which holds the members registered to the library. HashSet is used because it doesn't allow
  duplicate item.

The Library class methods achieve the following goals:

- printing a list of books available for lending.
- add books to the library store. (overloaded method for adding one or multiple books)
- lend books to members (validation includes checking if member is registered with the library, has late books or has
  already borrowed a certain book as the library does not lend two copies of the same book to the same member)
- process the returning a book by a member. If the book is returned late, the account status of the member is demoted.
- methods for finding a book by title, author or isbn.