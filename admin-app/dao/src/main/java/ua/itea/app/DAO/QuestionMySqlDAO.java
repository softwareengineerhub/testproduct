package ua.itea.app.DAO;

import ua.itea.app.model.Question;

import java.util.List;

public class QuestionDAO implements IDAO<Question> {
    @Override
    public boolean create(Question question) {
        return false;
    }

    @Override
    public Question read(Question question) {
        return null;
    }

    @Override
    public List<Question> readAll() {
        return null;
    }

    @Override
    public Question update(Question question, Question newT) {
        return null;
    }

    @Override
    public Question delete(Question question) {
        return null;
    }

    @Override
    public Question delete(int id) {
        return null;
    }

    @Override
    public int getId(Question question) {
        return 0;
    }
}
