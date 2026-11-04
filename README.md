# PatchTrail

A backend project for tracking vulnerable dependencies across software projects.

The idea is to collect dependency information, check it against known vulnerabilities, and identify which applications might be affected.

## Goals

- Import dependency data from SBOM files
- Check vulnerabilities using OSV
- Track affected projects and dependency changes
- Process updates asynchronously as the project grows

## Tech

Java 21, Spring Boot, PostgreSQL.

Planning for Kafka, Kafka Streams, k8s and AWS along the way.
