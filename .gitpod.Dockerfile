FROM gitpod/workspace-full-vnc

# install Chrome per https://github.com/JesterOrNot/Gitpod-Chrome/blob/master/.gitpod.Dockerfile
USER gitpod

RUN sudo apt-get -q update && \
    sudo apt-get install -yq chromium-browser && \
    sudo apt install libnss3 -y && \
    sudo rm -rf /var/lib/apt/lists/*
RUN cd /home/gitpod
RUN wget https://chromedriver.storage.googleapis.com/91.0.4472.19/chromedriver_linux64.zip && \ 
    unzip chromedriver_linux64.zip && \  
    rm -rf chromedriver_linux64.zip && \  
    sudo chmod +x chromedriver
ENV PATH=/home/gitpod:$PATH
