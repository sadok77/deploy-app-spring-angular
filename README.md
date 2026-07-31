# Full-Stack CI/CD Pipeline for Spring Boot and Angular

This repository showcases a GitHub Actions CI/CD pipeline for a full-stack application built with Spring Boot and Angular.

The workflow is configured to:

- build the backend and frontend Docker images
- log in to Docker Hub using repository secrets
- push versioned and `latest` images on every push to `main`

The goal of the project is to provide a simple, reproducible deployment flow for a modern web application using Docker, GitHub Actions, and Docker Hub.
