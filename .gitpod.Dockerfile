FROM selenium/standalone-chrome-debug
FROM gitpod/workspace-full

# install Chrome per https://github.com/JesterOrNot/Gitpod-Chrome/blob/master/.gitpod.Dockerfile
USER gitpod

RUN sudo apt-get update \
 && sudo apt-get install -y \
    chromium-browser \
 && sudo apt install libnss3 \
 && sudo rm -rf /var/lib/apt/lists/*
RUN cd /home/gitpod
RUN wget https://chromedriver.storage.googleapis.com/91.0.4472.19/chromedriver_linux64.zip \ 
 && unzip chromedriver_linux64.zip \  
 && rm -rf chromedriver_linux64.zip \  
 && sudo chmod +x chromedriver
ENV PATH=/home/gitpod:$PATH
