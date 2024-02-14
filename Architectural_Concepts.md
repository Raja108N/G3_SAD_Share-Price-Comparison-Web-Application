## Architectural Concepts

- **Simple Architecture:** Decouples the application into layers (presentation, business logic, data access) for maintainability and testability.
- **Clean Architecture:** Adheres to the Dependency Inversion Principle, where high-level modules depend on abstractions rather than concrete implementations.
- **Compound Components:** Groups related functionality into reusable components for code reuse and reduced complexity.
- **Basic Styles:** Utilizes architectural patterns like MVC (Model-View-Controller) to separate concerns and improve code organization.
- **Complex Connectors:** Implements data access and persistence using frameworks like Hibernate or Spring Data JPA for efficient database interactions.
- **EIS Styles:** Employs Enterprise Information Systems (EIS) styles, such as the Data Mapper pattern, to map data between the application and the database.
- **Service-Oriented Architecture (SOA):** Leverages web services to expose functionality as reusable components, enabling interoperability and loose coupling.

## Application Design

### 1. Data Retrieval and Storage
- Fetches daily share price data from Yahoo Finance API.
- Stores data in a relational database (e.g., SQLite) for persistence.
- Implements a data access layer using Hibernate or Spring Data JPA for database interaction.

### 2. Charting and Comparison
- Creates a charting component using a library like JFreeChart to display share price graphs.
- Allows users to select companies and time ranges for comparison.
- Implements a business logic layer to handle data retrieval, processing, and chart generation.

### 3. User Interface
- Designs a simple and intuitive user interface using JavaFX or Swing.
- Provides controls for selecting companies, dates, and chart types.
- Displays charts and relevant information clearly and concisely.

### 4. Architectural Implementation
- Applies the Simple Architecture pattern to separate the application into layers.
- Adheres to Clean Architecture principles for dependency inversion and testability.
- Creates compound components for data retrieval, charting, and user interface functionality.
- Employs Basic Styles (e.g., MVC) for code organization and maintainability.
- Utilizes Complex Connectors (e.g., Hibernate) for efficient database interactions.
- Considers SOA principles for potential future enhancements and interoperability.

## Scope and Features

### Initial Release
- Data retrieval and storage for a single company
- Charting of daily share prices for a single company
- Basic user interface for selecting companies and dates

### Future Enhancements
- Support for multiple companies and time ranges
- Advanced charting options (e.g., moving averages, technical indicators)
- Integration with other data sources (e.g., Google Finance)
- Web-based deployment for accessibility and scalability
