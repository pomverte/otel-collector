FROM nginx:1.27.2
ARG OPENTELEMETRY_WEBSERVER_VERSION=v1.0.3
WORKDIR /opt
ADD https://github.com/open-telemetry/opentelemetry-cpp-contrib/releases/download/webserver%2F${OPENTELEMETRY_WEBSERVER_VERSION}/opentelemetry-webserver-sdk-x64-linux.tgz .
RUN apt update \
    && tar xvfz opentelemetry-webserver-sdk-x64-linux.tgz \
    && cd ./opentelemetry-webserver-sdk \
    && ./install.sh \
    && rm -rf /var/lib/apt/lists/*
ENV LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/opt/opentelemetry-webserver-sdk/sdk_lib/lib
COPY nginx.conf /etc/nginx/nginx.conf
COPY opentelemetry_module.conf /etc/nginx/conf.d
