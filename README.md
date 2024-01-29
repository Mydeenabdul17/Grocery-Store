# Grocery Store Web Application

This is a web application for managing grocery store inventory. It provides functionalities for both users and administrators. Users can view the available stock, while administrators can add, update, and manage stock items.

## Features

- **User Features:**
  - View available stock items.
  - Browse grocery, vegetables, and stationary categories.
  - Search for specific items.

- **Admin Features:**
  - Add new stock items.
  - Update existing stock items.
  - Manage stock count for grocery, vegetables, and stationary.

## Technologies Used

- **Database:** MySQL
- **ORM:** Hibernate
- **Backend:** Java Servlets and JSP
- **Frontend:** HTML, CSS, JavaScript

## Setup Instructions

1. **Clone the repository:**
```base
git clone https://github.com/Mydeenabdul17/Grocery-Store.git
```

2. **Database Configuration:**
- Install MySQL and create a database named `grocery_store`.
- Configure the database connection details in `hibernate.cfg.xml`.

3. **Build and Run:**
- Build the project using Apache Maven.
- Deploy the WAR file to a servlet container like Apache Tomcat.
- Access the application through the browser.

## Project Structure

- **src/main/java:** Contains Java source code.
- **src/main/webapp:** Contains JSP files for the frontend.
- **src/main/resources:** Contains configuration files.

## Usage

- Access the application using a web browser.
- Users can browse available stock items and search for specific items.
- Admins can log in to add or update stock items.

