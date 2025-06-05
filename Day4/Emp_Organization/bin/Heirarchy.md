        Emp (Base Class)
        ├─ id
        ├─ name
        ├─ deptId
        ├─ basic
        └─ computeNetSalary()

        ▲
       / \
      /   \
    Mgr   Worker
    └─ performanceBonus       └─ hoursWorked, hourlyRate
    └─ computeNetSalary()     └─ computeNetSalary(), getHourlyRate()

    OOP Concept	Application in This Scenario
Class	Emp, Mgr, Worker, TestOrganization
Inheritance	Mgr and Worker inherit from base class Emp
Encapsulation	Each class has private/protected data members with public methods
Polymorphism	Method overriding – computeNetSalary() behaves differently in Mgr and Worker
Abstraction	Emp defines common structure; concrete salary logic is handled in child classes

📦 Packages
com.app.org: Contains domain classes (Emp, Mgr, Worker)

tester: Contains the main class TestOrganization for running the app

📘 Class Design Summary
1. Emp (Base Class)
State: id, name, deptId, basic

Behavior:

computeNetSalary() – base salary (can be overridden)

toString() – prints employee details

2. Mgr (Manager, inherits from Emp)
Additional State: performanceBonus

Behavior:

computeNetSalary() = basic + performanceBonus

overrides toString() for full details

3. Worker (inherits from Emp)
Additional State: hoursWorked, hourlyRate

Behavior:

computeNetSalary() = basic + (hoursWorked × hourlyRate)

getHourlyRate() to expose the rate

overrides toString() for full details

🎮 User Interaction – Menu Use Case Flow
TestOrganization (in tester package)
Handles menu-driven interaction:

Hire Manager

Input: ID, Name, DeptID, Basic, Performance Bonus

Action: Creates a Mgr object and stores it

Hire Worker

Input: ID, Name, DeptID, Basic, Hours Worked, Hourly Rate

Action: Creates a Worker object and stores it

Display All Employees

Uses a for-each loop on List<Emp>

Uses polymorphic toString() and computeNetSalary()

Update Basic Salary

Search employee by ID

Modify the basic salary field (encapsulated via setter)

Exit

Ends the application

**Benefits of OOP in This Use Case
Feature	Benefit
Inheritance	Code reuse, shared behavior across Emp → Mgr, Worker
Polymorphism	Common list of Emp type can hold both Mgr and Worker
Encapsulation	Controlled access to fields like hourlyRate, basic
Open for extension	Easy to add more roles like Consultant, Intern, etc.
