## Component Specification

### System Components:

1. **Data Access Component:**
Responsibilities:
- Retrieve share price data from external sources (e.g., Yahoo Finance)
- Store and retrieve price data from persistent storage (e.g., SQLite, JSON)

2. **Charting Component:**
Responsibilities:
- Generate line charts of share prices over time
- Allow users to compare charts of multiple companies

3. **User Interface Component:**
Responsibilities:
- Provide a user-friendly interface for inputting share symbols and date ranges
- Display charts and allow users to interact with them

4. **Data Model Component:**
Responsibilities:
- Represent share price data as objects
- Facilitate data persistence and retrieval

5. **Service Layer Component:**
Responsibilities:
- Orchestrate interactions between other components
- Enforce business rules and data validation

### Interactions:

- The User Interface Component interacts with the Service Layer Component to request share price data and charting.
- The Service Layer Component interacts with the Data Access Component to retrieve and store data.
- The Charting Component interacts with the Data Model Component to access share price data and generate charts.
