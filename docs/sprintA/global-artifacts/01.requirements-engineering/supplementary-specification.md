# Supplementary Specification (FURPS+)

## Functionality

_Specifies functionalities that:  
&nbsp; &nbsp; (i) are common across several US/UC;  
&nbsp; &nbsp; (ii) are not related to US/UC, namely: Audit, Reporting and Security._

* Business rules validation must be respected when recording and updating data.
#### Security
* All those who wish to use the application must be authenticated with a password.

## Usability

_Evaluates the user interface. It has several subcategories,
among them: error prevention; interface aesthetics and design; help and
documentation; consistency and standards._

* Passwords must be composed of seven alphanumeric characters, including three capital letters and two digits.

## Reliability

_Refers to the integrity, compliance and interoperability of the software. The requirements to be considered are: frequency and severity of failure, possibility of recovery, possibility of prediction, accuracy, average time between failures._

* The application should use object serialization to ensure data persistence between two runs of the application.

## Performance

_Evaluates the performance requirements of the software, namely: response time, start-up time, recovery time, memory consumption, CPU usage, load capacity and application availability._

(fill in here )

## Supportability

_The supportability requirements gathers several characteristics, such as:
testability, adaptability, maintainability, compatibility,
configurability, installability, scalability and more._

#### Localization
* The application must support the English Language.

## +

### Design Constraints

_Specifies or constraints the system design process. Examples may include: programming languages, software process, mandatory standards/patterns, use of development tools, class library, etc._

* The class structure must be designed to allow easy maintenance and the addition of new features, following the best OO practices.
* Best practices must be adopted for intentifying requirements, for OO software analysis and for design.
* Javadoc must be used to generate useful documentationfor Java code.
* All the images/figures produced during the sofwtware development process should be recorded in SVG format.

### Implementation Constraints

_Specifies or constraints the code or construction of a system such
such as: mandatory standards/patterns, implementation languages,
database integrity, resource limits, operating system._

* The application must be developed in Java language using the IntelliJ IDE or NetBeans.
* The application's graphical interface is to be developed in JavaFX 11.
* The implementation must follow a TDD (Test-Driven Development) approach, including, unit tests for all methods except for ones that implement Input/Output operations.
* The unit tests should be implemented using the JUnit 5 framework; the JaCoCo plugin should be used to generate the coverage report.
* Recognized coding standards (e.g. Camel case) must be adopted.

### Interface Constraints

_Specifies or constraints the features inherent to the interaction of the
system being developed with other external systems._



### Physical Constraints

_Specifies a limitation or physical requirement regarding the hardware used to house the system, as for example: material, shape, size or weight._
