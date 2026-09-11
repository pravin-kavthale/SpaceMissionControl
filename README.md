# 🚀 Space Mission Control System

A **Core Java console-based application** that simulates a Space Mission Control System.
The project is designed to demonstrate **Object-Oriented Programming (OOP)** concepts, Java collections, exception handling, validation, and modular application design.

The system allows mission controllers to create and manage space missions, assign crew members and spacecraft, monitor mission status, manage resources, and perform mission operations such as launch, abort, and completion.

---

## 📌 Project Overview

The **Space Mission Control System** acts as a simplified simulation of a real-world mission control center.

A mission can contain:

* Mission details
* Crew members
* Spacecraft
* Mission objectives
* Mission status
* Resources
* Launch and mission operations

The application provides a menu-driven console interface through which the user can manage the complete mission lifecycle.

---

## 🎯 Objectives

The main objectives of this project are:

* Practice **Core Java**
* Implement real-world **OOP concepts**
* Design classes with proper responsibilities
* Work with **Collections Framework**
* Implement input validation
* Handle exceptions properly
* Build a menu-driven Java application
* Simulate a real-world mission management system
* Apply clean and modular programming practices

---

## 🛠️ Technologies Used

| Technology            | Purpose                                   |
| --------------------- | ----------------------------------------- |
| Java                  | Application development                   |
| OOP                   | Application architecture                  |
| Collections Framework | Managing missions, crew, spacecraft, etc. |
| Exception Handling    | Handling invalid operations and inputs    |
| Java I/O              | Console input/output                      |
| Git & GitHub          | Version control                           |

---

## 🧠 Core OOP Concepts Demonstrated

### 1. Encapsulation

Data members are kept private and accessed through appropriate methods.

```java
private String missionName;
private String missionStatus;

public String getMissionName() {
    return missionName;
}

public void setMissionName(String missionName) {
    this.missionName = missionName;
}
```

### 2. Inheritance

Common properties and behaviors can be reused through inheritance.

For example:

```text
CrewMember
    |
    ├── Commander
    ├── Pilot
    └── Scientist
```

### 3. Polymorphism

Different types of crew members or mission operations can provide their own implementation of common methods.

### 4. Abstraction

Complex mission operations are hidden behind appropriate classes and methods.

### 5. Association / Composition

A mission can contain multiple crew members, a spacecraft, objectives, and resources.

---

## 🏗️ System Structure

The application can be organized into the following major components:

```text
                    SPACE MISSION CONTROL SYSTEM
                               |
              ┌────────────────┼────────────────┐
              |                |                |
           Missions           Crew          Spacecraft
              |                |                |
          Objectives       Roles/Skills      Status
              |
          Resources
              |
       Mission Operations
              |
      ┌───────┼────────┐
      |       |        |
    Launch   Abort   Complete
```

---

## 🚀 Main Features

### Mission Management

The system allows the user to:

* Create a new mission
* View mission details
* Update mission information
* Search for missions
* Delete missions
* Track mission status

### 👨‍🚀 Crew Management

Crew members can be:

* Added to missions
* Removed from missions
* Assigned specific roles
* Viewed along with their details

Possible roles include:

* Commander
* Pilot
* Engineer
* Scientist
* Mission Specialist

### 🛰️ Spacecraft Management

The system maintains spacecraft information such as:

* Spacecraft ID
* Spacecraft name
* Type
* Capacity
* Fuel/resources
* Availability
* Current mission

### 🎯 Mission Objectives

Each mission can contain multiple objectives.

Examples:

```text
- Deploy satellite
- Collect lunar samples
- Conduct scientific experiments
- Repair orbital equipment
- Explore a planetary surface
```

### 📊 Mission Status

A mission can move through different states:

```text
PLANNED
   ↓
READY
   ↓
LAUNCHED
   ↓
IN_PROGRESS
   ↓
COMPLETED
```

An emergency situation may result in:

```text
IN_PROGRESS
      ↓
    ABORTED
```

### ⚠️ Launch Validation

Before launching a mission, the system can verify conditions such as:

* Crew availability
* Spacecraft availability
* Required crew roles
* Mission objectives
* Required resources
* Mission readiness

If the conditions are not satisfied, the launch operation is rejected.

---

## 📋 Example Menu

```text
========================================
      SPACE MISSION CONTROL SYSTEM
========================================

1. Create Mission
2. View All Missions
3. Search Mission
4. Update Mission
5. Delete Mission

6. Add Crew Member
7. Remove Crew Member
8. View Crew

9. Assign Spacecraft
10. View Spacecraft

11. Add Mission Objective
12. View Objectives

13. Launch Mission
14. Abort Mission
15. Complete Mission

16. View Mission Status

0. Exit

Enter your choice:
```

---

## 🔄 Mission Lifecycle

A typical mission follows this lifecycle:

```text
Create Mission
      ↓
Assign Crew
      ↓
Assign Spacecraft
      ↓
Add Objectives
      ↓
Check Mission Readiness
      ↓
Launch
      ↓
Mission In Progress
      ↓
 ┌───────────────┐
 │               │
 ▼               ▼
Complete       Abort
 │               │
 ▼               ▼
COMPLETED      ABORTED
```

---

## 🗂️ Suggested Project Structure

```text
Space-Mission-Control-System/
│
├── src/
│   └── main/
│       └── java/
│           │
│           ├── model/
│           │   ├── Mission.java
│           │   ├── CrewMember.java
│           │   ├── Spacecraft.java
│           │   ├── Objective.java
│           │   └── Resource.java
│           │
│           ├── service/
│           │   ├── MissionService.java
│           │   ├── CrewService.java
│           │   └── SpacecraftService.java
│           │
│           ├── exception/
│           │   ├── MissionException.java
│           │   └── InvalidMissionException.java
│           │
│           ├── enums/
│           │   ├── MissionStatus.java
│           │   └── CrewRole.java
│           │
│           └── Main.java
│
├── README.md
└── .gitignore
```

---

## 🧪 Example Scenario

Suppose the mission controller creates:

```text
Mission ID       : M001
Mission Name     : Lunar Explorer
Destination      : Moon
Spacecraft       : Artemis-X
```

Crew:

```text
1. John Carter
   Role: Commander

2. Sarah Miller
   Role: Scientist

3. David Wilson
   Role: Engineer
```

Objectives:

```text
1. Collect lunar samples
2. Perform surface experiments
3. Deploy research equipment
```

After all required checks are successful:

```text
Checking mission readiness...

✓ Crew assigned
✓ Spacecraft assigned
✓ Objectives available
✓ Required resources available

Mission is READY for launch.

Launching Lunar Explorer...

🚀 Mission Launched Successfully!
```

---

## ⚠️ Error Handling

The application handles invalid operations such as:

* Invalid mission ID
* Duplicate mission ID
* Invalid crew assignment
* Spacecraft already assigned
* Launching without required crew
* Launching an already launched mission
* Aborting a completed mission
* Invalid menu choice
* Invalid user input

Example:

```text
ERROR: Mission cannot be launched.

Reason:
Required Commander role is missing.
```

---

## 📚 Concepts Practiced

This project provides practical experience with:

* Classes and Objects
* Constructors
* `this` keyword
* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Interfaces
* Abstract Classes
* Enums
* Collections
* `ArrayList`
* `HashMap`
* Exception Handling
* Custom Exceptions
* Method Overloading
* Method Overriding
* Static members
* Final variables
* Input validation
* Layered design

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone <repository-url>
```

### 2. Open the project

Open the project in:

* Eclipse
* Spring Tool Suite (STS)
* IntelliJ IDEA
* VS Code

### 3. Compile the project

Make sure Java is installed:

```bash
java -version
```

### 4. Run the application

Run:

```text
Main.java
```

The application will start with the Mission Control menu.

---

## 🔮 Future Enhancements

The project can be extended with:

* Database integration using MySQL
* JDBC
* File-based data persistence
* Login and authentication
* Mission history
* Real-time resource monitoring
* Crew skill validation
* Automated mission scheduling
* GUI using JavaFX
* REST API using Spring Boot
* Web-based Mission Control Dashboard

---

## 👨‍💻 Learning Outcome

This project demonstrates how **Core Java and OOP concepts can be combined to solve a realistic problem** rather than implementing isolated programming examples.

It provides practical experience in designing classes, managing relationships between objects, handling application state, validating business rules, and developing a complete console-based application.

---

## 📄 License

This project is created for **educational and learning purposes**.
