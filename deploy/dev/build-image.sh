#!/bin/bash
podman build -t conserwit.com/stock-analyzer/sa-main-service:dev -f Dockerfile .
